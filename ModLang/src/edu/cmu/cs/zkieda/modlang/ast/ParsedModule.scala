package edu.cmu.cs.zkieda.modlang.ast

import java.util.{List => JList}

/**
 * @author zkieda
 */
case class ParsedModule(baseClass : JavaRef, children : JList[ParsedModule]) extends Node{}