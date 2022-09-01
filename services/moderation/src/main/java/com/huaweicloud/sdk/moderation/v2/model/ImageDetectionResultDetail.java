package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ImageDetectionResultDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "politics")

    @JacksonXmlProperty(localName = "politics")

    private List<ImageDetectionResultDetailPolitics> politics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "porn")

    @JacksonXmlProperty(localName = "porn")

    private List<ImageDetectionResultSimpleDetail> porn = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terrorism")

    @JacksonXmlProperty(localName = "terrorism")

    private List<ImageDetectionResultSimpleDetail> terrorism = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad")

    @JacksonXmlProperty(localName = "ad")

    private List<ImageDetectionResultAdDetail> ad = null;

    public ImageDetectionResultDetail withPolitics(List<ImageDetectionResultDetailPolitics> politics) {
        this.politics = politics;
        return this;
    }

    public ImageDetectionResultDetail addPoliticsItem(ImageDetectionResultDetailPolitics politicsItem) {
        if (this.politics == null) {
            this.politics = new ArrayList<>();
        }
        this.politics.add(politicsItem);
        return this;
    }

    public ImageDetectionResultDetail withPolitics(Consumer<List<ImageDetectionResultDetailPolitics>> politicsSetter) {
        if (this.politics == null) {
            this.politics = new ArrayList<>();
        }
        politicsSetter.accept(this.politics);
        return this;
    }

    /**
     * 涉政敏感人物检测结果。
     * @return politics
     */
    public List<ImageDetectionResultDetailPolitics> getPolitics() {
        return politics;
    }

    public void setPolitics(List<ImageDetectionResultDetailPolitics> politics) {
        this.politics = politics;
    }

    public ImageDetectionResultDetail withPorn(List<ImageDetectionResultSimpleDetail> porn) {
        this.porn = porn;
        return this;
    }

    public ImageDetectionResultDetail addPornItem(ImageDetectionResultSimpleDetail pornItem) {
        if (this.porn == null) {
            this.porn = new ArrayList<>();
        }
        this.porn.add(pornItem);
        return this;
    }

    public ImageDetectionResultDetail withPorn(Consumer<List<ImageDetectionResultSimpleDetail>> pornSetter) {
        if (this.porn == null) {
            this.porn = new ArrayList<>();
        }
        pornSetter.accept(this.porn);
        return this;
    }

    /**
     * 涉黄检测结果。
     * @return porn
     */
    public List<ImageDetectionResultSimpleDetail> getPorn() {
        return porn;
    }

    public void setPorn(List<ImageDetectionResultSimpleDetail> porn) {
        this.porn = porn;
    }

    public ImageDetectionResultDetail withTerrorism(List<ImageDetectionResultSimpleDetail> terrorism) {
        this.terrorism = terrorism;
        return this;
    }

    public ImageDetectionResultDetail addTerrorismItem(ImageDetectionResultSimpleDetail terrorismItem) {
        if (this.terrorism == null) {
            this.terrorism = new ArrayList<>();
        }
        this.terrorism.add(terrorismItem);
        return this;
    }

    public ImageDetectionResultDetail withTerrorism(Consumer<List<ImageDetectionResultSimpleDetail>> terrorismSetter) {
        if (this.terrorism == null) {
            this.terrorism = new ArrayList<>();
        }
        terrorismSetter.accept(this.terrorism);
        return this;
    }

    /**
     * 涉政、暴恐检测结果。
     * @return terrorism
     */
    public List<ImageDetectionResultSimpleDetail> getTerrorism() {
        return terrorism;
    }

    public void setTerrorism(List<ImageDetectionResultSimpleDetail> terrorism) {
        this.terrorism = terrorism;
    }

    public ImageDetectionResultDetail withAd(List<ImageDetectionResultAdDetail> ad) {
        this.ad = ad;
        return this;
    }

    public ImageDetectionResultDetail addAdItem(ImageDetectionResultAdDetail adItem) {
        if (this.ad == null) {
            this.ad = new ArrayList<>();
        }
        this.ad.add(adItem);
        return this;
    }

    public ImageDetectionResultDetail withAd(Consumer<List<ImageDetectionResultAdDetail>> adSetter) {
        if (this.ad == null) {
            this.ad = new ArrayList<>();
        }
        adSetter.accept(this.ad);
        return this;
    }

    /**
     * 广告检测结果。
     * @return ad
     */
    public List<ImageDetectionResultAdDetail> getAd() {
        return ad;
    }

    public void setAd(List<ImageDetectionResultAdDetail> ad) {
        this.ad = ad;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionResultDetail imageDetectionResultDetail = (ImageDetectionResultDetail) o;
        return Objects.equals(this.politics, imageDetectionResultDetail.politics)
            && Objects.equals(this.porn, imageDetectionResultDetail.porn)
            && Objects.equals(this.terrorism, imageDetectionResultDetail.terrorism)
            && Objects.equals(this.ad, imageDetectionResultDetail.ad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(politics, porn, terrorism, ad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultDetail {\n");
        sb.append("    politics: ").append(toIndentedString(politics)).append("\n");
        sb.append("    porn: ").append(toIndentedString(porn)).append("\n");
        sb.append("    terrorism: ").append(toIndentedString(terrorism)).append("\n");
        sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
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
