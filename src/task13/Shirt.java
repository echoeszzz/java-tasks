package task13;

import java.util.ArrayList;

public class Shirt {
    private String Id;
    private String title;
    private String color;
    private String size;

    public Shirt(String id, String title, String color, String size) {
        this.Id = id;
        this.title = title;
        this.color = color;
        this.size = size;
    }

    public Shirt(String[] args) {
        if (args.length == 4) {
            this.Id = args[0];
            this.title = args[1];
            this.color = args[2];
            this.size = args[3];
        } else {
            System.out.println("Need 4 args");
            System.exit(-1);
        }
    }

    @Override
    public String toString() {
        return "Shirt{" + "Id='" + Id + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        ArrayList<Shirt> shirts1 = new ArrayList<>(11);
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T- Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (var s : shirts) {
            shirts1.add(new Shirt(s.split(",")));
        }
        for (var s : shirts1) {
            System.out.println(s);
        }
    }
}

