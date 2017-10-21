package vlfsoft.jdpatterns.principles;

import java.lang.annotation.*;

/**
 * See <a href="http://java-design-patterns.com/principles/">Principles</a>
 */
@Documented
@Inherited
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface GenericPrinciple {

    /**
     * See <a href="http://java-design-patterns.com/principles/#kiss">KISS</a>
     * KISS - Keep It Simple Stupid
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface KISS {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#yagni">YAGNI</a>
     * YAGNI - you aren't gonna need it
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface YAGNI {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#do-the-simplest-thing-that-could-possibly-work">Do The Simplest Thing That Could Possibly Work</a>
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface DoTheSimplestThingThatCouldPossiblyWork {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#separation-of-concerns">Separation of Concerns</a>
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface SeparationOfConcerns {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#do-the-simplest-thing-that-could-possibly-work">Keep things DRY</a>
     * DRY - don't repeat yourself
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface KeepThingsDRY {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#code-for-the-maintainer">CodeForTheMaintainer</a>
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface CodeForTheMaintainer {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#avoid-premature-optimization">Avoid Premature Optimization</a>
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface AvoidPrematureOptimization {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#boy-scout-rule">Boy-Scout Rule</a>
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface BoyScoutRule {
    }

    /**
     * See <a href="http://java-design-patterns.com/principles/#minimise-coupling">MinimiseCoupling</a>
     */
    @Documented
    @Inherited
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @interface MinimiseCoupling {
    }

}
