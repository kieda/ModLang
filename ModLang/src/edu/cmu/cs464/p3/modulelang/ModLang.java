package edu.cmu.cs464.p3.modulelang;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import edu.cmu.cs464.p3.modulelang.ModuleFactory.ModuleConstructor;
import edu.cmu.cs464.p3.modulelang.linker.NTree;
import edu.cmu.cs464.p3.modulelang.parser.ParseProgram;

public class ModLang<T> {
	private final ModuleConstructor<T> constructor;
	public ModLang(ModuleConstructor<T> constructor) {
		this.constructor = constructor;
	}
	public <S extends T> S build(NTree<Class<?>> tree){
		return (S)constructor.construct(tree);
	}
	public <S extends T> S build(InputStream in) throws Exception{
		return build(ParseProgram.parseAndLink(in));
	}
	public <S extends T> S build(File f) throws Exception, IOException{
		return build(new FileInputStream(f));
	}
	public <S extends T> S build(String modLang) throws Exception{
		return build(new ByteArrayInputStream(modLang.getBytes()));
	}

	public static <T> ModLang<T> gen(String... properties){
		Properties p = new Properties();
		if(properties.length % 2 != 0) 
			throw new IllegalArgumentException("Expected even number of properties for key/value pairs");
		for(int i = 0; i < properties.length; i+=2){
			p.put(properties[i], properties[i+1]);
		}
		return gen(p);
	}
	public static <T> ModLang<T> gen(Properties properties){
		return new ModLang<T>(new PropertiesModuleFactory<T>(properties).build());
	}
	
	public static void main(String[] a) throws Exception{
		ArrayList al = gen("multiModuleClass", "java.util.ArrayList",
			"moduleClass", "java.lang.Object", 
			"addMethod", "add").build("import java.lang.* end java.util.ArrayList : has Object Object java.util.ArrayList : has Object Object end end");
		System.out.println(al);
	}
}
