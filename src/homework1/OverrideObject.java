package homework1;

public class OverrideObject {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public OverrideObject() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        OverrideObject oo = (OverrideObject) obj;
        return age == oo.age && (name == oo.name) || (name != null && name.equals(oo.name));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        OverrideObject foo;
        try {
            foo = (OverrideObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
        foo.setAge(this.age);
        foo.setName(this.name);
        return foo;
    }

    @Override
    public String toString() {
        return name + age;
    }
}
