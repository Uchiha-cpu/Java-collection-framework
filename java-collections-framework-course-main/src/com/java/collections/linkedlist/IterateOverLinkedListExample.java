package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateOverLinkedListExample {
 public static void main(String[] args) {
  LinkedList<String> progLangs = new LinkedList<>();

  progLangs.add("C");
  progLangs.add("C++");
  progLangs.add("Core Java");
  progLangs.add("Java EE");
  progLangs.add("Spring Framework");
  progLangs.add("Hibernate Framework");

  System.out.println("=== Iterate over a LinkedList using " + " Java 8 forEach and lambda ===");
  progLangs.forEach(name -> {System.out.println(name);});

  System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
  Iterator<String> iterator = progLangs.iterator();
  while (iterator.hasNext()) {
   String speciesName = iterator.next();
   System.out.println(speciesName);
  }

  System.out.println("\n=== Iterate over a LinkedList using iterator() " + " and Java 8 forEachRemaining() method ===");
  iterator = progLangs.iterator();
  iterator.forEachRemaining(speciesName -> {System.out.println(speciesName);});

  System.out.println("\n=== Iterate over a LinkedList " + " using descendingIterator() ===");
  Iterator<String> descendingIterator = progLangs.descendingIterator();
  while (descendingIterator.hasNext()) {
   String speciesName = descendingIterator.next();
   System.out.println(speciesName);
  }

  System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
  // ListIterator can be used to iterate over the LinkedList in both forward and
  // backward directions
  // In this example, we start from the end of the list and traverse backwards
  ListIterator<String> listIterator = progLangs.listIterator(progLangs.size());
  while (listIterator.hasPrevious()) {
   String speciesName = listIterator.previous();
   System.out.println(speciesName);
  }

  System.out.println("\n=== Iterate over a LinkedList " + " using simple for-each loop ===");
  for (String name : progLangs) {
   System.out.println(name);
  }
 }
}