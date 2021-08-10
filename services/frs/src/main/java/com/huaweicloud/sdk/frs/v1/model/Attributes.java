package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Attributes */
public class Attributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dress")

    private List<String> dress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glass")

    private String glass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gender")

    private String gender;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yaw_angle")

    private Double yawAngle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roll_angle")

    private Double rollAngle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pitch_angle")

    private Double pitchAngle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hat")

    private String hat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headpose")

    private List<Double> headpose = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "age")

    private Integer age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smile")

    private String smile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask")

    private String mask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beard")

    private String beard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skin")

    private String skin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethnic")

    private String ethnic;

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

    public Attributes withDress(List<String> dress) {
        this.dress = dress;
        return this;
    }

    public Attributes addDressItem(String dressItem) {
        if (this.dress == null) {
            this.dress = new ArrayList<>();
        }
        this.dress.add(dressItem);
        return this;
    }

    public Attributes withDress(Consumer<List<String>> dressSetter) {
        if (this.dress == null) {
            this.dress = new ArrayList<>();
        }
        dressSetter.accept(this.dress);
        return this;
    }

    /** 包含glass和hat两个属性结果。
     * 
     * @return dress */
    public List<String> getDress() {
        return dress;
    }

    public void setDress(List<String> dress) {
        this.dress = dress;
    }

    public Attributes withGlass(String glass) {
        this.glass = glass;
        return this;
    }

    /** 是否带眼镜： • yes：带眼镜 • dark：带墨镜 • none：未戴眼镜 • unknown：未知
     * 
     * @return glass */
    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public Attributes withGender(String gender) {
        this.gender = gender;
        return this;
    }

    /** 性别： • male：男 • female：女 • unknown：未知
     * 
     * @return gender */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Attributes withYawAngle(Double yawAngle) {
        this.yawAngle = yawAngle;
        return this;
    }

    /** 围绕Y轴旋转，偏航角，范围[-180,180]。
     * 
     * @return yawAngle */
    public Double getYawAngle() {
        return yawAngle;
    }

    public void setYawAngle(Double yawAngle) {
        this.yawAngle = yawAngle;
    }

    public Attributes withRollAngle(Double rollAngle) {
        this.rollAngle = rollAngle;
        return this;
    }

    /** 围绕Z轴旋转，翻滚角，范围[-180,180]。
     * 
     * @return rollAngle */
    public Double getRollAngle() {
        return rollAngle;
    }

    public void setRollAngle(Double rollAngle) {
        this.rollAngle = rollAngle;
    }

    public Attributes withPitchAngle(Double pitchAngle) {
        this.pitchAngle = pitchAngle;
        return this;
    }

    /** 围绕X轴旋转，俯仰角，范围[-180,180]。
     * 
     * @return pitchAngle */
    public Double getPitchAngle() {
        return pitchAngle;
    }

    public void setPitchAngle(Double pitchAngle) {
        this.pitchAngle = pitchAngle;
    }

    public Attributes withHat(String hat) {
        this.hat = hat;
        return this;
    }

    /** 是否戴帽子： • yes：戴帽子 • none：未戴帽子 • unknown：未知
     * 
     * @return hat */
    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public Attributes withHeadpose(List<Double> headpose) {
        this.headpose = headpose;
        return this;
    }

    public Attributes addHeadposeItem(Double headposeItem) {
        if (this.headpose == null) {
            this.headpose = new ArrayList<>();
        }
        this.headpose.add(headposeItem);
        return this;
    }

    public Attributes withHeadpose(Consumer<List<Double>> headposeSetter) {
        if (this.headpose == null) {
            this.headpose = new ArrayList<>();
        }
        headposeSetter.accept(this.headpose);
        return this;
    }

    /** 人脸轮廓坐标值。
     * 
     * @return headpose */
    public List<Double> getHeadpose() {
        return headpose;
    }

    public void setHeadpose(List<Double> headpose) {
        this.headpose = headpose;
    }

    public Attributes withAge(Integer age) {
        this.age = age;
        return this;
    }

    /** 年龄。
     * 
     * @return age */
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Attributes withSmile(String smile) {
        this.smile = smile;
        return this;
    }

    /** 笑脸。
     * 
     * @return smile */
    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public Attributes withMask(String mask) {
        this.mask = mask;
        return this;
    }

    /** 是否戴口罩： • yes：戴口罩 • none：未戴口罩 • unknown：未知
     * 
     * @return mask */
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

    /** 胡须： • yes：有胡须 • none：无胡须 • unknown：未知
     * 
     * @return beard */
    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    public Attributes withSkin(String skin) {
        this.skin = skin;
        return this;
    }

    /** 肤色： • brown：棕 • yellow：黄 • white：白 • black：黑 • unknown：未知
     * 
     * @return skin */
    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Attributes withEthnic(String ethnic) {
        this.ethnic = ethnic;
        return this;
    }

    /** 民族： • han：汉族 • other：其他 • unknown：未知
     * 
     * @return ethnic */
    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public Attributes withPhototype(String phototype) {
        this.phototype = phototype;
        return this;
    }

    /** 图片类型： • idcard：证件照 • monitor：摄像头监控 • internet photo：网络图片
     * 
     * @return phototype */
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

    /** Get quality
     * 
     * @return quality */
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

    /** 发型： • long：长发 • short：短发 • unknown：未知
     * 
     * @return hair */
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

    /** Get expression
     * 
     * @return expression */
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

    /** 人脸图片旋转角（顺时针偏转角度），支持0°、90°、180°和270°图片旋转。
     * 
     * @return faceAngle */
    public Integer getFaceAngle() {
        return faceAngle;
    }

    public void setFaceAngle(Integer faceAngle) {
        this.faceAngle = faceAngle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) o;
        return Objects.equals(this.dress, attributes.dress) && Objects.equals(this.glass, attributes.glass)
            && Objects.equals(this.gender, attributes.gender) && Objects.equals(this.yawAngle, attributes.yawAngle)
            && Objects.equals(this.rollAngle, attributes.rollAngle)
            && Objects.equals(this.pitchAngle, attributes.pitchAngle) && Objects.equals(this.hat, attributes.hat)
            && Objects.equals(this.headpose, attributes.headpose) && Objects.equals(this.age, attributes.age)
            && Objects.equals(this.smile, attributes.smile) && Objects.equals(this.mask, attributes.mask)
            && Objects.equals(this.beard, attributes.beard) && Objects.equals(this.skin, attributes.skin)
            && Objects.equals(this.ethnic, attributes.ethnic) && Objects.equals(this.phototype, attributes.phototype)
            && Objects.equals(this.quality, attributes.quality) && Objects.equals(this.hair, attributes.hair)
            && Objects.equals(this.expression, attributes.expression)
            && Objects.equals(this.faceAngle, attributes.faceAngle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dress,
            glass,
            gender,
            yawAngle,
            rollAngle,
            pitchAngle,
            hat,
            headpose,
            age,
            smile,
            mask,
            beard,
            skin,
            ethnic,
            phototype,
            quality,
            hair,
            expression,
            faceAngle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attributes {\n");
        sb.append("    dress: ").append(toIndentedString(dress)).append("\n");
        sb.append("    glass: ").append(toIndentedString(glass)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    yawAngle: ").append(toIndentedString(yawAngle)).append("\n");
        sb.append("    rollAngle: ").append(toIndentedString(rollAngle)).append("\n");
        sb.append("    pitchAngle: ").append(toIndentedString(pitchAngle)).append("\n");
        sb.append("    hat: ").append(toIndentedString(hat)).append("\n");
        sb.append("    headpose: ").append(toIndentedString(headpose)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    smile: ").append(toIndentedString(smile)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
        sb.append("    beard: ").append(toIndentedString(beard)).append("\n");
        sb.append("    skin: ").append(toIndentedString(skin)).append("\n");
        sb.append("    ethnic: ").append(toIndentedString(ethnic)).append("\n");
        sb.append("    phototype: ").append(toIndentedString(phototype)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    hair: ").append(toIndentedString(hair)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    faceAngle: ").append(toIndentedString(faceAngle)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
