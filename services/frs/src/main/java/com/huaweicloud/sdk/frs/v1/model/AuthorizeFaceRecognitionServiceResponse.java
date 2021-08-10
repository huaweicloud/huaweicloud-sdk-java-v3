package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class AuthorizeFaceRecognitionServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_face_set_number")

    private Integer maxFaceSetNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_service")

    private ServiceInfo detectService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_detect_service")

    private ServiceInfo liveDetectService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_service")

    private ServiceInfo compareService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_service")

    private ServiceInfo searchService;

    public AuthorizeFaceRecognitionServiceResponse withMaxFaceSetNumber(Integer maxFaceSetNumber) {
        this.maxFaceSetNumber = maxFaceSetNumber;
        return this;
    }

    /** 调用成功时表示最大的人脸库数量。 调用失败时无此字段。
     * 
     * @return maxFaceSetNumber */
    public Integer getMaxFaceSetNumber() {
        return maxFaceSetNumber;
    }

    public void setMaxFaceSetNumber(Integer maxFaceSetNumber) {
        this.maxFaceSetNumber = maxFaceSetNumber;
    }

    public AuthorizeFaceRecognitionServiceResponse withDetectService(ServiceInfo detectService) {
        this.detectService = detectService;
        return this;
    }

    public AuthorizeFaceRecognitionServiceResponse withDetectService(Consumer<ServiceInfo> detectServiceSetter) {
        if (this.detectService == null) {
            this.detectService = new ServiceInfo();
            detectServiceSetter.accept(this.detectService);
        }

        return this;
    }

    /** Get detectService
     * 
     * @return detectService */
    public ServiceInfo getDetectService() {
        return detectService;
    }

    public void setDetectService(ServiceInfo detectService) {
        this.detectService = detectService;
    }

    public AuthorizeFaceRecognitionServiceResponse withLiveDetectService(ServiceInfo liveDetectService) {
        this.liveDetectService = liveDetectService;
        return this;
    }

    public AuthorizeFaceRecognitionServiceResponse withLiveDetectService(
        Consumer<ServiceInfo> liveDetectServiceSetter) {
        if (this.liveDetectService == null) {
            this.liveDetectService = new ServiceInfo();
            liveDetectServiceSetter.accept(this.liveDetectService);
        }

        return this;
    }

    /** Get liveDetectService
     * 
     * @return liveDetectService */
    public ServiceInfo getLiveDetectService() {
        return liveDetectService;
    }

    public void setLiveDetectService(ServiceInfo liveDetectService) {
        this.liveDetectService = liveDetectService;
    }

    public AuthorizeFaceRecognitionServiceResponse withCompareService(ServiceInfo compareService) {
        this.compareService = compareService;
        return this;
    }

    public AuthorizeFaceRecognitionServiceResponse withCompareService(Consumer<ServiceInfo> compareServiceSetter) {
        if (this.compareService == null) {
            this.compareService = new ServiceInfo();
            compareServiceSetter.accept(this.compareService);
        }

        return this;
    }

    /** Get compareService
     * 
     * @return compareService */
    public ServiceInfo getCompareService() {
        return compareService;
    }

    public void setCompareService(ServiceInfo compareService) {
        this.compareService = compareService;
    }

    public AuthorizeFaceRecognitionServiceResponse withSearchService(ServiceInfo searchService) {
        this.searchService = searchService;
        return this;
    }

    public AuthorizeFaceRecognitionServiceResponse withSearchService(Consumer<ServiceInfo> searchServiceSetter) {
        if (this.searchService == null) {
            this.searchService = new ServiceInfo();
            searchServiceSetter.accept(this.searchService);
        }

        return this;
    }

    /** Get searchService
     * 
     * @return searchService */
    public ServiceInfo getSearchService() {
        return searchService;
    }

    public void setSearchService(ServiceInfo searchService) {
        this.searchService = searchService;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizeFaceRecognitionServiceResponse authorizeFaceRecognitionServiceResponse =
            (AuthorizeFaceRecognitionServiceResponse) o;
        return Objects.equals(this.maxFaceSetNumber, authorizeFaceRecognitionServiceResponse.maxFaceSetNumber)
            && Objects.equals(this.detectService, authorizeFaceRecognitionServiceResponse.detectService)
            && Objects.equals(this.liveDetectService, authorizeFaceRecognitionServiceResponse.liveDetectService)
            && Objects.equals(this.compareService, authorizeFaceRecognitionServiceResponse.compareService)
            && Objects.equals(this.searchService, authorizeFaceRecognitionServiceResponse.searchService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxFaceSetNumber, detectService, liveDetectService, compareService, searchService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeFaceRecognitionServiceResponse {\n");
        sb.append("    maxFaceSetNumber: ").append(toIndentedString(maxFaceSetNumber)).append("\n");
        sb.append("    detectService: ").append(toIndentedString(detectService)).append("\n");
        sb.append("    liveDetectService: ").append(toIndentedString(liveDetectService)).append("\n");
        sb.append("    compareService: ").append(toIndentedString(compareService)).append("\n");
        sb.append("    searchService: ").append(toIndentedString(searchService)).append("\n");
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
