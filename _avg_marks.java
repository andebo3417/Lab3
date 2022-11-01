public class _avg_marks {
    private int physics;
    private int math;
    private int economics;

    public _avg_marks(int physics, int math, int economics) {
        set_physics(physics);
        set_math(math);
        set_economics(economics);
    }

    public _avg_marks() {
        set_physics(0);
        set_math(0);
        set_economics(0);
    }

    public _avg_marks(int physics) {
        set_physics(physics);
        set_math(0);
        set_economics(0);
    }

    public int set_physics(int mark) {
        if (mark >= 0 && mark <= 100) this.physics = mark;
    else {
            System.out.println("Wrong value sent to set_physics");
            return -1;
        }
        return 0;
    }

    public int set_math(int mark) {
        if (mark >= 0 && mark <= 100) this.math = mark;
        else {
            System.out.println("Wrong value sent to set_math");
            return -1;
        }
        return 0;
    }

    public int set_economics(int mark) {
        if (mark >= 0 && mark <= 100) this.economics = mark;
        else {
            System.out.println("Wrong value sent to set_economics");
            return -1;
        }
        return 0;
    }

    public int get_physics() {
        return this.physics;
    }

    public int get_math() {
        return this.math;
    }

    public int get_economics() {
        return this.economics;
    }

    public int get_avg_rating() {
        return (this.economics + this.math + this.physics) / 3;
    }
}
