

public class Matrise{
    
    private final double[][] data;
    private final int rows;
    private final int cols;

    //Matrise konstruktør
    public Matrise(double[][] data){
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                this.data[i][j]=data[i][j];
            }
        }
    }

    //metode for å addere matriser
    public Matrise add(Matrise other){
        if (this.cols != other.cols  || this.rows != other.rows){
            return null;
        }
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrise(result);
    }

    //metode for å multiplisere matriser
    public Matrise multiply(Matrise other) {
        if (this.cols != other.rows) {
            return null;
        }

        double[][] result = new double[this.rows][other.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrise(result);
    }

    //metode for å transportere matrisen
    public Matrise transpose(){
        double[][] result = new double[cols][rows];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result[i][j] = this.data[j][i];
            }
        }
        return new Matrise(result);
    }

    //metode for å printe matriser
    public void print(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
