package task29;

class OrderAlreadyException extends Exception {
    public OrderAlreadyException(String address) {
        super("The order for " + address + " was already added!");
    }
}

class IllegalAddress extends Error {
    public IllegalAddress(String address) {
        super("There is no such address " + address);
    }
}

class IllegalTableNumber extends Error {
    public IllegalTableNumber(String address){
        super("There is no table with such address" + address);
    }
}