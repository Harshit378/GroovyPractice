package xml

import groovy.xml.MarkupBuilder
import java.awt.Component.BaselineResizeBehavior

class XmlParsing {

	static def File xmlFile = new File("C:/Users/Harshit_Tiwari/Desktop/test.xml");

	public static def readText(){
		def xmlString = xmlFile.text
		//println "XML string retrieved is " + xmlString;
		return xmlString
	}

	/**
	 * @param xmlString
	 * @return
	 */
	public static def parseTextUsingSlurper(def xmlString){
		println "***********************XML SLURPER****************************"
		// Use XmlSlurper to parse the xml text or file
		def nodes = new XmlSlurper().parseText(xmlString)
		def widgets = nodes.book.size()
		println "Number of Books present in the XML are : ${widgets}" ;
		def bookTitle = nodes.book[0].title.text();
		def description = nodes.book[0].description.text();
		println "First Book is : ${bookTitle} and its \n description is : ${description}"

		println "Using GPath expression to get Attribute Values"
		def firstBook = nodes.book[0].@id // Using dot operator node.@id
		def bookAttribute = nodes.book[0]['@id'] //Using map notation ['@id']
		println "Value of 'id' attribute of the first book is : ${firstBook} also ${bookAttribute}";
	}

	/**
	 * @param xmlString
	 * @return
	 */
	public static def parseTextUsingParser(def xmlString){
		// Use XmlParser to parse the xml text or file
		println "***********************XML PARSER****************************"
		def nodes = new XmlParser().parseText(xmlString)
		def books = nodes.book.size()
		println "Number of Books present in the XML are : ${books}" ;
		def bookTitle = nodes.book[0].title.text();
		def description = nodes.book[0].description.text();
		println "First Book is : ${bookTitle} and its \n description is : ${description}"
	}

	/**
	 * @return
	 */
	public static def findUsingBreadthFirst(){
		println "Searching for the Book 'Oberon's Legacy'"
		def response = new XmlSlurper().parse(new File("C:/Users/Harshit_Tiwari/Desktop/test.xml"));
		def searchBook = response.'*'.find {node -> node.name() == 'book' && node.title.text() == 'Oberon\'s Legacy'}
		println "Book Title : ${searchBook.title} \nAuthor : ${searchBook.author} \nBook Price : ${searchBook.price}";
	}
	
	/**
	 * @return
	 */
	public static def findUsingDepthFirst(){
		println "depthFirst() is the same as looking something everywhere in the tree from this point down\n"
		def response = new XmlSlurper().parse(new File("C:/Users/Harshit_Tiwari/Desktop/test.xml"));
		def horrorBook = response.'**'.find {book -> book.genre.text() == 'Horror'}
		println "\n${horrorBook.title} \n${horrorBook.author} \n${horrorBook.price} \n${horrorBook.publish_date}"
		
		println "Find all the nodes with an expression i.e. Books Genre == Fantasy\n"
		def allBooks = response.'**'.findAll {book -> book.genre == 'Fantasy'}
		println "There are ${allBooks.size()} Fantasy books in the Catalog"
	}
	
	public static def createXml(){
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		
		xml.records() {
			car(name:'HSV Maloo', make:'Holden', year:2006) {
				country('Australia')
				record(type:'speed', 'Production Pickup Truck with speed of 271kph')
			}
			car(name:'Royale', make:'Bugatti', year:1931) {
				country('France')
				record(type:'price', 'Most Valuable Car at $15 million')
			}
		}
		
		File createdXml = new File("CreatedXmlFile.xml");
		createdXml.write(writer.toString());
	}
	
	public static def manipulateXml(){
		
	}
}
