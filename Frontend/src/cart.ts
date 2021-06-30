export class Cart{
    private menuItem !: String;
    private price !: any;

    constructor(menuItem: String,price: any){
        this.menuItem = menuItem;
        this.price = price;
    }
}