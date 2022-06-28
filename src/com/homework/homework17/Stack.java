package com.homework.homework17;


import java.util.Arrays;

class Stack
    {
        private int array[];
        private int top;
        private int capacity;

        Stack(int size)
        {
            array = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x)
        {
            if (isFull())
            {
                System.out.println("Overflow");
                System.exit(-1);
            }

            array[++top] = x;
        }

        public int pop()
        {

            if (isEmpty())
            {
                System.out.println("Underflow");
                System.exit(-1);
            }
            return array[top--];
        }


        public int size() {
            return top + 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return size() == capacity;     // или return size() == capacity;
        }
    }




