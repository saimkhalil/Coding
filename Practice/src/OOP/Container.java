package OOP;


import Collections.GenericLinkedList;

import java.util.Iterator;

public class Container<Item> implements Iterable<Item>
{
    private GenericLinkedList<Item> linkedList;

    public Container()
    {
        this.linkedList = new GenericLinkedList<>();
    }

    public void addToContainer(Item item)
    {
        this.linkedList.add(item);
    }

    public  Item removeFromContainer() throws Exception {
        return this.linkedList.remove();
    }

    public boolean isContainerEmpty()
    {
        return this.linkedList.isEmpty();
    }


    @Override
    public Iterator<Item> iterator() {

        return new ContainerIterator();
    }

    private class ContainerIterator implements Iterator<Item>
    {
        private GenericLinkedList.Node<Item> itemNode;

        public ContainerIterator()
        {
            this.itemNode = linkedList.getHead();
        }

        @Override
        public boolean hasNext()
        {
            return itemNode != null;
        }

        @Override
        public Item next()
        {
            Item item = itemNode.data;
            itemNode = itemNode.next;
            return item;
        }
    }
}
