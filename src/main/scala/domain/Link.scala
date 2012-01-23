package domain

/*
* Codigo tomado de https://github.com/rynmrtn/scrawler
* de https://github.com/rynmrtn 
*
*/

class Link(val parent: String, val link: String, val description: String) {
        override def toString = {
                  "Parent: " + parent + "\nLink: " + link + "\n"
         }
}
