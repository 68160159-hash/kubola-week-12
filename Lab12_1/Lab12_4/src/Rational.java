public class Rational {
    int sed;
    int suan;

    public Rational(int a, int b) {
        sed = a;
        suan = b;
    }

    public double getReal() {
        return (double) sed / suan;
    }

    // แก้ไขชื่อ Class ให้เป็น Rational ให้หมด
    public Rational plus(Rational r) {
        int tmpSed, tmpSuan;
        if (this.suan == r.suan) {
            tmpSed = this.sed + r.sed;
            tmpSuan = this.suan;
        } else {
            tmpSed = (this.sed * r.suan) + (r.sed * this.suan);
            tmpSuan = this.suan * r.suan;
        }
        return new Rational(tmpSed, tmpSuan);
    }

    // แก้ไข Logic ของ sub และปีกกา
    public Rational sub(Rational r) {
        int tmpSed, tmpSuan;
        if (this.suan == r.suan) {
            tmpSed = this.sed - r.sed;
            tmpSuan = this.suan;
        } else {
            tmpSed = (this.sed * r.suan) - (r.sed * this.suan);
            tmpSuan = this.suan * r.suan;
        }
        return new Rational(tmpSed, tmpSuan);
    }

    public String show() {
        return sed + "/" + suan;
    }
}

