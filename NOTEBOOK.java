public class NOTEBOOK {
    String model;               //Модель
    String opsistem;            //Операционная система
    int randaccessmemory;       //Оперативная память в ГБ
    int size;                   //Размер ноутбука (диагональ)
    String color;               //Цвет ноутбука

    public NOTEBOOK(String model, String opsistem, int randaccessmemory, int size, String color){
        this.model = model;
        this.opsistem = opsistem;
        this.randaccessmemory = randaccessmemory;
        this.size = size;
        this.color = color;
    }

    public String getModel() {
        return model;
    }
    
    public String getOpsistem() {
        return opsistem;
    }

    public int getRandaccessmemory() {
        return randaccessmemory;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean contains(String fil) {
        return false;
    }

    @Override
    public String toString() {
        return "\n" + "Модель: " + model + "\n"
               + "Операционная система: " + opsistem + "\n"
               + "Оперативная память в ГБ: " + randaccessmemory + "\n"
               + "Размер ноутбука (диагональ) в Дюймах: " + size + "\n"
               + "Цвет ноутбука: " + color + "\n";
    }

}
