package Assignment01;

public class ComplexNumber {
    float real, img;
    ComplexNumber(){}
    ComplexNumber(float real, float img){
        this.real = real;
        this.img = img;
    }

    ComplexNumber add(ComplexNumber n2){
        ComplexNumber result = new ComplexNumber();
        result.real = this.real + n2.real;
        result.img = this.img + n2.img;
        return result;
    }

    ComplexNumber sub(ComplexNumber n2){
        ComplexNumber result = new ComplexNumber();
        result.real = this.real - n2.real;
        result.img = this.img - n2.img;
        return result;
    }
    ComplexNumber mul(ComplexNumber n2){
        ComplexNumber result = new ComplexNumber();
        result.real = (this.real * n2.real ) - (this.real * n2.img);
        result.img = (this.real * n2.img) + (this.img * n2.real);
        return result;
    }
    ComplexNumber div(ComplexNumber n2){
        ComplexNumber result = new ComplexNumber();
        result.real = ((this.real * n2.real ) + (this.real * n2.img))/ (n2.real * n2.real + n2.img * n2.img);
        result.img = ((this.real * n2.img) - (this.img * n2.real) )/ (n2.real * n2.real + n2.img * n2.img);
        return result;
    }


    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(2.4f, 3.5f);
        ComplexNumber n2 = new ComplexNumber(5.7f, 8.5f);
        ComplexNumber res = n1.add(n2);
        System.out.printf("Addition: %2.2fr + %2.2fi\n",res.real, res.img);
        res = n1.mul(n2);
        System.out.printf("Multiplication: %2.2fr + %2.2fi\n", res.real, res.img);
        res = n1.div(n2);
        System.out.printf("Division: %2.2fr + %2.2fi\n", res.real, res.img);
    }
}
