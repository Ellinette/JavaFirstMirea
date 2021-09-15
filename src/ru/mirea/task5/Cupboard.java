package ru.mirea.task5;

class Cupboard extends Furniture {
    private int ShelfNum;

    public Cupboard(String material, int amount, int ShelfNum){
        super(material, amount);
        this.ShelfNum = ShelfNum;
    }

    public void ShToString(){
        System.out.println("Material of Chair is "+super.getMaterial()+", amount = "+ super.getAmount()+", number of shelves "+ ShelfNum);
    }
}
