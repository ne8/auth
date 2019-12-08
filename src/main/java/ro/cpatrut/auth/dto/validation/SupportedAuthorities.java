package ro.cpatrut.auth.dto.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = AuthoritiesValidator.class)
public @interface SupportedAuthorities {
    String message() default "Must be one of the supported authorities";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
