package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Attributes
 */
public class Attributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dress")

    private Dress dress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glass")

    private String glass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hat")

    private String hat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "age")

    private Integer age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask")

    private String mask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beard")

    private String beard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phototype")

    private String phototype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality")

    private FaceQuality quality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hair")

    private String hair;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private AttributesExpression expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_angle")

    private Integer faceAngle;

    public Attributes withDress(Dress dress) {
        this.dress = dress;
        return this;
    }

    public Attributes withDress(Consumer<Dress> dressSetter) {
        if (this.dress == null) {
            this.dress = new Dress();
            dressSetter.accept(this.dress);
        }

        return this;
    }

    /**
     * Get dress
     * @return dress
     */
    public Dress getDress() {
        return dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }

    public Attributes withGlass(String glass) {
        this.glass = glass;
        return this;
    }

    /**
     * 是否带眼镜： • yes：带眼镜 • dark：带墨镜 • none：未戴眼镜 • unknown：未知
     * @return glass
     */
    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public Attributes withHat(String hat) {
        this.hat = hat;
        return this;
    }

    /**
     * 是否戴帽子： • yes：戴帽子 • none：未戴帽子 • unknown：未知
     * @return hat
     */
    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public Attributes withAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * 年龄。
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Attributes withMask(String mask) {
        this.mask = mask;
        return this;
    }

    /**
     * 是否戴口罩： • yes：戴口罩 • none：未戴口罩 • unknown：未知
     * @return mask
     */
    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public Attributes withBeard(String beard) {
        this.beard = beard;
        return this;
    }

    /**
     * 胡须： • yes：有胡须 • none：无胡须 • unknown：未知
     * @return beard
     */
    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    public Attributes withPhototype(String phototype) {
        this.phototype = phototype;
        return this;
    }

    /**
     * 图片类型： • idcard：证件照 • monitor：摄像头监控 • internet photo：网络图片
     * @return phototype
     */
    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype;
    }

    public Attributes withQuality(FaceQuality quality) {
        this.quality = quality;
        return this;
    }

    public Attributes withQuality(Consumer<FaceQuality> qualitySetter) {
        if (this.quality == null) {
            this.quality = new FaceQuality();
            qualitySetter.accept(this.quality);
        }

        return this;
    }

    /**
     * Get quality
     * @return quality
     */
    public FaceQuality getQuality() {
        return quality;
    }

    public void setQuality(FaceQuality quality) {
        this.quality = quality;
    }

    public Attributes withHair(String hair) {
        this.hair = hair;
        return this;
    }

    /**
     * 发型： • long：长发 • short：短发 • unknown：未知
     * @return hair
     */
    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Attributes withExpression(AttributesExpression expression) {
        this.expression = expression;
        return this;
    }

    public Attributes withExpression(Consumer<AttributesExpression> expressionSetter) {
        if (this.expression == null) {
            this.expression = new AttributesExpression();
            expressionSetter.accept(this.expression);
        }

        return this;
    }

    /**
     * Get expression
     * @return expression
     */
    public AttributesExpression getExpression() {
        return expression;
    }

    public void setExpression(AttributesExpression expression) {
        this.expression = expression;
    }

    public Attributes withFaceAngle(Integer faceAngle) {
        this.faceAngle = faceAngle;
        return this;
    }

    /**
     * 人脸图片旋转角（顺时针偏转角度），支持0°、90°、180°和270°图片旋转。
     * @return faceAngle
     */
    public Integer getFaceAngle() {
        return faceAngle;
    }

    public void setFaceAngle(Integer faceAngle) {
        this.faceAngle = faceAngle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes that = (Attributes) obj;
        return Objects.equals(this.dress, that.dress) && Objects.equals(this.glass, that.glass)
            && Objects.equals(this.hat, that.hat) && Objects.equals(this.age, that.age)
            && Objects.equals(this.mask, that.mask) && Objects.equals(this.beard, that.beard)
            && Objects.equals(this.phototype, that.phototype) && Objects.equals(this.quality, that.quality)
            && Objects.equals(this.hair, that.hair) && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.faceAngle, that.faceAngle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dress, glass, hat, age, mask, beard, phototype, quality, hair, expression, faceAngle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attributes {\n");
        sb.append("    dress: ").append(toIndentedString(dress)).append("\n");
        sb.append("    glass: ").append(toIndentedString(glass)).append("\n");
        sb.append("    hat: ").append(toIndentedString(hat)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
        sb.append("    beard: ").append(toIndentedString(beard)).append("\n");
        sb.append("    phototype: ").append(toIndentedString(phototype)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    hair: ").append(toIndentedString(hair)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    faceAngle: ").append(toIndentedString(faceAngle)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
