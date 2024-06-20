package com.bookstore.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.*;

@Target({TYPE,FIELD}) //áp dụng các loại dữ liệu (class) và các môi trường (field)
@Retention(RUNTIME) //Cho phép được sử dụng runtime để thực hiện các kiểm tra
@Constraint(validatedBy = ValidCategoryIdValidator.class) // Lớp validatior cần kiểm tra
public @interface ValidCategoryId {
    String message() default "Danh mục không hợp le";
    Class<?>[] groups() default {}; // nhóm các ràng buộc liên quan lại với nhau
    Class<? extends Payload>[] payload() default{}; // cung cấp thông tin chi tiết về loi
}
