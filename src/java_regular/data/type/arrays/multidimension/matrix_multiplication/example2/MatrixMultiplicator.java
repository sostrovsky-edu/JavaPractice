package java_regular.data.type.arrays.multidimension.matrix_multiplication.example2;

public class MatrixMultiplicator {
    public static Matrix multiply(Matrix p, Matrix q) throws MultiplicationException {
        int v = p.getVerticalSize();
        int h = q.getHorizontalSize();
        int temp = p.getHorizontalSize();

        // проверка возможности умножения
        if(temp != q.getVerticalSize())
            throw new MultiplicationException();

        // создание матрицы результата
        Matrix result = new Matrix(v,h);

        // умножение
        for(int i=0; i<v; i++) {
            for (int j = 0; j<h; j++) {
                int value = 0;

                for (int k = 0; k<temp; k++)
                    value += p.getElement(i, k) * q.getElement(k, j);

                result.setElement(i, j, value);
            }
        }

        return result;
    }
}
