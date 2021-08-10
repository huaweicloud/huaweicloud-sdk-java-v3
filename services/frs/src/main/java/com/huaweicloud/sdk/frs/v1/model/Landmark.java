package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Landmark */
public class Landmark {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eyes_contour")

    private List<Point> eyesContour = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mouth_contour")

    private List<Point> mouthContour = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_contour")

    private List<Point> faceContour = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eyebrow_contour")

    private List<Point> eyebrowContour = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nose_contour")

    private List<Point> noseContour = null;

    public Landmark withEyesContour(List<Point> eyesContour) {
        this.eyesContour = eyesContour;
        return this;
    }

    public Landmark addEyesContourItem(Point eyesContourItem) {
        if (this.eyesContour == null) {
            this.eyesContour = new ArrayList<>();
        }
        this.eyesContour.add(eyesContourItem);
        return this;
    }

    public Landmark withEyesContour(Consumer<List<Point>> eyesContourSetter) {
        if (this.eyesContour == null) {
            this.eyesContour = new ArrayList<>();
        }
        eyesContourSetter.accept(this.eyesContour);
        return this;
    }

    /** 眼睛轮廓，Point为轮廓坐标值。
     * 
     * @return eyesContour */
    public List<Point> getEyesContour() {
        return eyesContour;
    }

    public void setEyesContour(List<Point> eyesContour) {
        this.eyesContour = eyesContour;
    }

    public Landmark withMouthContour(List<Point> mouthContour) {
        this.mouthContour = mouthContour;
        return this;
    }

    public Landmark addMouthContourItem(Point mouthContourItem) {
        if (this.mouthContour == null) {
            this.mouthContour = new ArrayList<>();
        }
        this.mouthContour.add(mouthContourItem);
        return this;
    }

    public Landmark withMouthContour(Consumer<List<Point>> mouthContourSetter) {
        if (this.mouthContour == null) {
            this.mouthContour = new ArrayList<>();
        }
        mouthContourSetter.accept(this.mouthContour);
        return this;
    }

    /** 嘴巴轮廓，Point为轮廓坐标值。
     * 
     * @return mouthContour */
    public List<Point> getMouthContour() {
        return mouthContour;
    }

    public void setMouthContour(List<Point> mouthContour) {
        this.mouthContour = mouthContour;
    }

    public Landmark withFaceContour(List<Point> faceContour) {
        this.faceContour = faceContour;
        return this;
    }

    public Landmark addFaceContourItem(Point faceContourItem) {
        if (this.faceContour == null) {
            this.faceContour = new ArrayList<>();
        }
        this.faceContour.add(faceContourItem);
        return this;
    }

    public Landmark withFaceContour(Consumer<List<Point>> faceContourSetter) {
        if (this.faceContour == null) {
            this.faceContour = new ArrayList<>();
        }
        faceContourSetter.accept(this.faceContour);
        return this;
    }

    /** 人脸轮廓，Point为轮廓坐标值。
     * 
     * @return faceContour */
    public List<Point> getFaceContour() {
        return faceContour;
    }

    public void setFaceContour(List<Point> faceContour) {
        this.faceContour = faceContour;
    }

    public Landmark withEyebrowContour(List<Point> eyebrowContour) {
        this.eyebrowContour = eyebrowContour;
        return this;
    }

    public Landmark addEyebrowContourItem(Point eyebrowContourItem) {
        if (this.eyebrowContour == null) {
            this.eyebrowContour = new ArrayList<>();
        }
        this.eyebrowContour.add(eyebrowContourItem);
        return this;
    }

    public Landmark withEyebrowContour(Consumer<List<Point>> eyebrowContourSetter) {
        if (this.eyebrowContour == null) {
            this.eyebrowContour = new ArrayList<>();
        }
        eyebrowContourSetter.accept(this.eyebrowContour);
        return this;
    }

    /** 眉毛轮廓，Point为轮廓坐标值。
     * 
     * @return eyebrowContour */
    public List<Point> getEyebrowContour() {
        return eyebrowContour;
    }

    public void setEyebrowContour(List<Point> eyebrowContour) {
        this.eyebrowContour = eyebrowContour;
    }

    public Landmark withNoseContour(List<Point> noseContour) {
        this.noseContour = noseContour;
        return this;
    }

    public Landmark addNoseContourItem(Point noseContourItem) {
        if (this.noseContour == null) {
            this.noseContour = new ArrayList<>();
        }
        this.noseContour.add(noseContourItem);
        return this;
    }

    public Landmark withNoseContour(Consumer<List<Point>> noseContourSetter) {
        if (this.noseContour == null) {
            this.noseContour = new ArrayList<>();
        }
        noseContourSetter.accept(this.noseContour);
        return this;
    }

    /** 鼻子轮廓，Point为轮廓坐标值。
     * 
     * @return noseContour */
    public List<Point> getNoseContour() {
        return noseContour;
    }

    public void setNoseContour(List<Point> noseContour) {
        this.noseContour = noseContour;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Landmark landmark = (Landmark) o;
        return Objects.equals(this.eyesContour, landmark.eyesContour)
            && Objects.equals(this.mouthContour, landmark.mouthContour)
            && Objects.equals(this.faceContour, landmark.faceContour)
            && Objects.equals(this.eyebrowContour, landmark.eyebrowContour)
            && Objects.equals(this.noseContour, landmark.noseContour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyesContour, mouthContour, faceContour, eyebrowContour, noseContour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Landmark {\n");
        sb.append("    eyesContour: ").append(toIndentedString(eyesContour)).append("\n");
        sb.append("    mouthContour: ").append(toIndentedString(mouthContour)).append("\n");
        sb.append("    faceContour: ").append(toIndentedString(faceContour)).append("\n");
        sb.append("    eyebrowContour: ").append(toIndentedString(eyebrowContour)).append("\n");
        sb.append("    noseContour: ").append(toIndentedString(noseContour)).append("\n");
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
