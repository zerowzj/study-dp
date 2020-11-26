package study.dp.builder;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Car {

    private String brand;

    private String logo;

    /**
     * 1.私有
     * 2.入参 Builder
     */
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.logo = builder.logo;
    }

    /**
     * 1.构造器类
     */
    static class Builder {

        /**
         * 1.可以提供默认值
         */
        private String brand = "audi";

        private String logo = "audi";

        /**
         * 1.根据参数的必填 或 可选设计构造函数
         */
        public Builder() {
        }

        public Builder(String brand) {
            this.brand = brand;
        }

        private Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String[] args) {
        Car car = new Car.Builder().build();
       log.info(">>>>>> {}", car.getBrand());
    }
}
