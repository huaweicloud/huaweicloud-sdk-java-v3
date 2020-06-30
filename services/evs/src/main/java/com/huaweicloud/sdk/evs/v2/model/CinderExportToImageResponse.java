package com.huaweicloud.sdk.evs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.Image;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CinderExportToImageResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-volume_upload_image")
    
    private Image osVolumeUploadImage = null;

    public CinderExportToImageResponse withOsVolumeUploadImage(Image osVolumeUploadImage) {
        this.osVolumeUploadImage = osVolumeUploadImage;
        return this;
    }

    public CinderExportToImageResponse withOsVolumeUploadImage(Consumer<Image> osVolumeUploadImageSetter) {
        if(this.osVolumeUploadImage == null ){
            this.osVolumeUploadImage = new Image();
            osVolumeUploadImageSetter.accept(this.osVolumeUploadImage);
        }
        
        return this;
    }


    /**
     * Get osVolumeUploadImage
     * @return osVolumeUploadImage
     */
    public Image getOsVolumeUploadImage() {
        return osVolumeUploadImage;
    }

    public void setOsVolumeUploadImage(Image osVolumeUploadImage) {
        this.osVolumeUploadImage = osVolumeUploadImage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderExportToImageResponse cinderExportToImageResponse = (CinderExportToImageResponse) o;
        return Objects.equals(this.osVolumeUploadImage, cinderExportToImageResponse.osVolumeUploadImage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(osVolumeUploadImage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderExportToImageResponse {\n");
        sb.append("    osVolumeUploadImage: ").append(toIndentedString(osVolumeUploadImage)).append("\n");
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

