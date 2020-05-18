package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.CinderExportToImageOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class CinderExportToImageRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-volume_upload_image")
    
    private CinderExportToImageOption osVolumeUploadImage = null;

    public CinderExportToImageRequestBody withOsVolumeUploadImage(CinderExportToImageOption osVolumeUploadImage) {
        this.osVolumeUploadImage = osVolumeUploadImage;
        return this;
    }

    public CinderExportToImageRequestBody withOsVolumeUploadImage(Consumer<CinderExportToImageOption> osVolumeUploadImageSetter) {
        if(this.osVolumeUploadImage == null ){
            this.osVolumeUploadImage = new CinderExportToImageOption();
        }
        osVolumeUploadImageSetter.accept(this.osVolumeUploadImage);
        return this;
    }


    /**
     * Get osVolumeUploadImage
     * @return osVolumeUploadImage
     */
    public CinderExportToImageOption getOsVolumeUploadImage() {
        return osVolumeUploadImage;
    }

    public void setOsVolumeUploadImage(CinderExportToImageOption osVolumeUploadImage) {
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
        CinderExportToImageRequestBody cinderExportToImageRequestBody = (CinderExportToImageRequestBody) o;
        return Objects.equals(this.osVolumeUploadImage, cinderExportToImageRequestBody.osVolumeUploadImage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(osVolumeUploadImage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderExportToImageRequestBody {\n");
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

