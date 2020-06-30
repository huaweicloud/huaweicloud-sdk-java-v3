package com.huaweicloud.sdk.moderation.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.ImageDetectionResultDetailPolitics;
import com.huaweicloud.sdk.moderation.v1.model.ImageDetectionResultDetailPorn;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ImageDetectionResultDetail
 */
public class ImageDetectionResultDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="politics")
    
    private List<ImageDetectionResultDetailPolitics> politics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="porn")
    
    private List<ImageDetectionResultDetailPorn> porn = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="terrorism")
    
    private List<ImageDetectionResultDetailPorn> terrorism = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ad")
    
    private List<ImageDetectionResultDetailPorn> ad = null;
    
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
        if(this.politics == null ){
            this.politics = new ArrayList<>();
        }
        politicsSetter.accept(this.politics);
        return this;
    }

    /**
     * Get politics
     * @return politics
     */
    public List<ImageDetectionResultDetailPolitics> getPolitics() {
        return politics;
    }

    public void setPolitics(List<ImageDetectionResultDetailPolitics> politics) {
        this.politics = politics;
    }

    public ImageDetectionResultDetail withPorn(List<ImageDetectionResultDetailPorn> porn) {
        this.porn = porn;
        return this;
    }

    
    public ImageDetectionResultDetail addPornItem(ImageDetectionResultDetailPorn pornItem) {
        if (this.porn == null) {
            this.porn = new ArrayList<>();
        }
        this.porn.add(pornItem);
        return this;
    }

    public ImageDetectionResultDetail withPorn(Consumer<List<ImageDetectionResultDetailPorn>> pornSetter) {
        if(this.porn == null ){
            this.porn = new ArrayList<>();
        }
        pornSetter.accept(this.porn);
        return this;
    }

    /**
     * Get porn
     * @return porn
     */
    public List<ImageDetectionResultDetailPorn> getPorn() {
        return porn;
    }

    public void setPorn(List<ImageDetectionResultDetailPorn> porn) {
        this.porn = porn;
    }

    public ImageDetectionResultDetail withTerrorism(List<ImageDetectionResultDetailPorn> terrorism) {
        this.terrorism = terrorism;
        return this;
    }

    
    public ImageDetectionResultDetail addTerrorismItem(ImageDetectionResultDetailPorn terrorismItem) {
        if (this.terrorism == null) {
            this.terrorism = new ArrayList<>();
        }
        this.terrorism.add(terrorismItem);
        return this;
    }

    public ImageDetectionResultDetail withTerrorism(Consumer<List<ImageDetectionResultDetailPorn>> terrorismSetter) {
        if(this.terrorism == null ){
            this.terrorism = new ArrayList<>();
        }
        terrorismSetter.accept(this.terrorism);
        return this;
    }

    /**
     * Get terrorism
     * @return terrorism
     */
    public List<ImageDetectionResultDetailPorn> getTerrorism() {
        return terrorism;
    }

    public void setTerrorism(List<ImageDetectionResultDetailPorn> terrorism) {
        this.terrorism = terrorism;
    }

    public ImageDetectionResultDetail withAd(List<ImageDetectionResultDetailPorn> ad) {
        this.ad = ad;
        return this;
    }

    
    public ImageDetectionResultDetail addAdItem(ImageDetectionResultDetailPorn adItem) {
        if (this.ad == null) {
            this.ad = new ArrayList<>();
        }
        this.ad.add(adItem);
        return this;
    }

    public ImageDetectionResultDetail withAd(Consumer<List<ImageDetectionResultDetailPorn>> adSetter) {
        if(this.ad == null ){
            this.ad = new ArrayList<>();
        }
        adSetter.accept(this.ad);
        return this;
    }

    /**
     * Get ad
     * @return ad
     */
    public List<ImageDetectionResultDetailPorn> getAd() {
        return ad;
    }

    public void setAd(List<ImageDetectionResultDetailPorn> ad) {
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
        return Objects.equals(this.politics, imageDetectionResultDetail.politics) &&
            Objects.equals(this.porn, imageDetectionResultDetail.porn) &&
            Objects.equals(this.terrorism, imageDetectionResultDetail.terrorism) &&
            Objects.equals(this.ad, imageDetectionResultDetail.ad);
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

