import xml.XmlParsing

XmlParsing xml = new XmlParsing();
def xmlText = xml.readText()

xml.parseTextUsingSlurper(xmlText)

xml.parseTextUsingParser(xmlText)

xml.findUsingBreadthFirst()

xml.findUsingDepthFirst()

xml.createXml()