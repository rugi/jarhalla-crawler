package org.xhubacubi.jarhalla.crawler.main;


import java.net.URL
import scala.io.Source
import action.LinkParser

object Main{
	def main(args: Array[String]) {
  		println("----------------------------------------")
        val sourceUrl = "http://www.google.com/"
        val source = Source.fromURL(new URL(sourceUrl))
        val lst = LinkParser.parse(sourceUrl, source)

        println("\n" + lst.size + " links were found.\n")
        lst.foreach { link => println(link.toString) }
  		println("----------------------------------------")
	}
}