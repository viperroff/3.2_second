package gun.kolmykov;

public class GunMachine extends Gun {
    private final int fireRate;

    public GunMachine() {
        this(30, 30);
    }

    public GunMachine(int maxAmmo) {
        this(maxAmmo, maxAmmo / 2);
    }

    public GunMachine(int maxAmmo, int fireRate) {
        super(maxAmmo, maxAmmo);
        if (fireRate <= 0) {
            throw new IllegalArgumentException("Скорострельность автомата не может быть отрицательной или равна нулю");
        }
        this.fireRate = fireRate;
    }

    @Override
    public String shoot() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fireRate; i++) {
            result.append(super.shoot()).append("\n");
        }
        return result.toString();
    }

    public String shootTimes(int times) {
        if (times <= 0) {
            throw new IllegalArgumentException("Количество секунд на огонь из автомата не может быть отрицательным либо равен нулю");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times * fireRate; i++) {
            result.append(super.shoot()).append("\n");
        }
        return result.toString();
    }

    @Override
    public String discharge() {
        int previousAmmo = ammo;
        ammo = 0;
        return "Автомат был разряжен, было возвращено " + previousAmmo + " патронов";
    }

    @Override
    public String toString() {
        return super.toString() + ", Скорострельность: " + fireRate + " выстрелов/секунду";
    }
}
