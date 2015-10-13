package edu.cmu.cs.zkieda.modlang.ast

import java.util.{List => JList};

/**
 * @author zkieda
 */
case class Program(imports : JList[ModuleImport], baseModule : ParsedModule) extends Node{}