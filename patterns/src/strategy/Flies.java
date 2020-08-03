package strategy;

public interface Flies {
    String fly();
}

/// Examples below
class CanFly implements Flies {

    @Override
    public String fly() {
        return "Flying high";
    }
}


class CannotFly implements Flies {

    @Override
    public String fly() {
        return "I cant fly :(";
    }
}
