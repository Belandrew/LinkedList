package com.company;

 class LinkList {
     private Node head;
     private Node tail;

     public LinkList() {
           head = null;
          tail = null;
     }
     /* Додати елемент в кінець списку */

     public void add(Integer data) {
         Node newNode = new Node(); //створюємо новий елемент списку
         newNode.setData(data);
         if (head == null) {
             head = newNode;
             tail = newNode;
         } else {
             tail.setNext(newNode);
             tail = newNode;
         }

     }


     /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
     public Integer get(int index) {
         Node current = head;
         while (current != null)
         {
             if (current.getData() == index)
             {
                 return current.getData();
             }

             current = current.getNext();
         }

         return null;

     }
     /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
     public boolean delete(int index) {
         Node previous = null;
         Node current = head;

         while (current != null)
         {
             if (current.getData() == index)
             {
                 // Узел в середине или в конце.
                 if (previous != null)
                 {
                     previous.setNext(current.getNext());

                     // Если в конце, то меняем _tail.
                     if (current.getNext() == null)
                     {
                         tail = previous;
                     }
                 }
                 else
                 {

                     head = head.getNext();

                     // Список теперь пустой?
                     if (head == null)
                     {
                         tail = null;
                     }
                 }



                 return true;
             }

             previous = current;
             current = current.getNext();
         }

         return false;
     }

     /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
     public int size() {
         Node current = head;
         int i = 0;
         while (current != null)
         {
             i++;
             current = current.getNext();

         }
         return i;
     }
 }





    public class LinkedList {
        public static void main(String[] args) {
            LinkList newNode = new LinkList();
            newNode.add(12);
            newNode.add(10);
            newNode.add(45);
            newNode.add(14);
            newNode.add(54);
            newNode.add(55);
            System.out.println(newNode.size());
            newNode.delete(45);
            System.out.println(newNode.size());
            System.out.println(newNode.get(55));
          //  newNode.add(45);
          //  newNode.add(14);
           // newNode.add(54);
           // newNode.add(55);
            System.out.println(newNode.size());
            newNode.delete(99);
            newNode.delete(55);
            System.out.println(newNode.size());

            // newList.displayList();

            // Node f = newList.find(10);
            //System.out.println("Ми знайшли: " +f.Data);
        }

    }
