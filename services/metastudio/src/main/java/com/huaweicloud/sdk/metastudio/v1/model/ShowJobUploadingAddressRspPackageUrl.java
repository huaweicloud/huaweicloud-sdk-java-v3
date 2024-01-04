package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 整包上传任务的url。
 */
public class ShowJobUploadingAddressRspPackageUrl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_data_uploading_url")

    private String trainingDataUploadingUrl;

    public ShowJobUploadingAddressRspPackageUrl withTrainingDataUploadingUrl(String trainingDataUploadingUrl) {
        this.trainingDataUploadingUrl = trainingDataUploadingUrl;
        return this;
    }

    /**
     * 上传的训练数据地址,用户需要将训练数据打成zip包后上传到该url。 > * 通过该obs地址上传时需要设置content-type为application/zip
     * @return trainingDataUploadingUrl
     */
    public String getTrainingDataUploadingUrl() {
        return trainingDataUploadingUrl;
    }

    public void setTrainingDataUploadingUrl(String trainingDataUploadingUrl) {
        this.trainingDataUploadingUrl = trainingDataUploadingUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobUploadingAddressRspPackageUrl that = (ShowJobUploadingAddressRspPackageUrl) obj;
        return Objects.equals(this.trainingDataUploadingUrl, that.trainingDataUploadingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingDataUploadingUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobUploadingAddressRspPackageUrl {\n");
        sb.append("    trainingDataUploadingUrl: ").append(toIndentedString(trainingDataUploadingUrl)).append("\n");
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
