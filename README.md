There are five collection types in hibernate used for one-to-many relationship mappings.

Bag
Set
List
Array
Map

Difference betweeen bag and list is bag is unordered with duplicate allowed collection type,
and in list we maintain the insertion order in collection.The most important thing is 
to know that Hibernate can map your collections as a bag implicitly if you don't use index column in one-to-many relation.
http://assarconsulting.blogspot.in/2009/08/why-hibernate-does-delete-all-then-re.html
