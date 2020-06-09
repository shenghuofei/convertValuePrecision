public class ConvertValuePrecision {

    /**
     * 将value精确度到precision位
     *
     * @param value 原始数据
     * @param precision  要保留的小数点后位数
     * @return
     */
    public static Double convertValuePrecision(Double value, int precision) {
        double pow = Math.pow(10, precision);
        return Math.round(value * pow) / pow;
    }
  
    public static void main(String []args) {
        Double value = 12.34561232123;
        int precision = 2;
        System.out.print(convertValuePrecision(value,precision));
    }
}
