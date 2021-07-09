package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.BaseInfo;
import com.huaweicloud.sdk.vod.v1.model.TranscodeInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTakeOverAssetDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;
    /**
     * 媒资状态。 - \"CREATING\"：上传中 - \"FAILED\"：上传失败 - \"CREATED\"：上传成功 - \"PUBLISHED\"：已发布 - \"DELETED\"：已删除
     */
    public static final class AssetStatusEnum {

        
        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final AssetStatusEnum CREATING = new AssetStatusEnum("CREATING");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final AssetStatusEnum FAILED = new AssetStatusEnum("FAILED");
        
        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final AssetStatusEnum CREATED = new AssetStatusEnum("CREATED");
        
        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final AssetStatusEnum PUBLISHED = new AssetStatusEnum("PUBLISHED");
        
        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final AssetStatusEnum DELETED = new AssetStatusEnum("DELETED");
        

        private static final Map<String, AssetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetStatusEnum> createStaticFields() {
            Map<String, AssetStatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("FAILED", FAILED);
            map.put("CREATED", CREATED);
            map.put("PUBLISHED", PUBLISHED);
            map.put("DELETED", DELETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AssetStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AssetStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AssetStatusEnum(value);
            }
            return result;
        }

        public static AssetStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AssetStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AssetStatusEnum) {
                return this.value.equals(((AssetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_status")
    
    private AssetStatusEnum assetStatus;
    /**
     * 转码状态 - \"UN_TRANSCODE\"：未转码 - \"WAITING_TRANSCODE\"：等待转码，排队中 - \"TRANSCODING\"：转码中 - \"TRANSCODE_SUCCEED\"：转码成功 - \"TRANSCODE_FAILED\"：转码失败
     */
    public static final class TranscodeStatusEnum {

        
        /**
         * Enum UN_TRANSCODE for value: "UN_TRANSCODE"
         */
        public static final TranscodeStatusEnum UN_TRANSCODE = new TranscodeStatusEnum("UN_TRANSCODE");
        
        /**
         * Enum WAITING_TRANSCODE for value: "WAITING_TRANSCODE"
         */
        public static final TranscodeStatusEnum WAITING_TRANSCODE = new TranscodeStatusEnum("WAITING_TRANSCODE");
        
        /**
         * Enum TRANSCODING for value: "TRANSCODING"
         */
        public static final TranscodeStatusEnum TRANSCODING = new TranscodeStatusEnum("TRANSCODING");
        
        /**
         * Enum TRANSCODE_SUCCEED for value: "TRANSCODE_SUCCEED"
         */
        public static final TranscodeStatusEnum TRANSCODE_SUCCEED = new TranscodeStatusEnum("TRANSCODE_SUCCEED");
        
        /**
         * Enum TRANSCODE_FAILED for value: "TRANSCODE_FAILED"
         */
        public static final TranscodeStatusEnum TRANSCODE_FAILED = new TranscodeStatusEnum("TRANSCODE_FAILED");
        

        private static final Map<String, TranscodeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TranscodeStatusEnum> createStaticFields() {
            Map<String, TranscodeStatusEnum> map = new HashMap<>();
            map.put("UN_TRANSCODE", UN_TRANSCODE);
            map.put("WAITING_TRANSCODE", WAITING_TRANSCODE);
            map.put("TRANSCODING", TRANSCODING);
            map.put("TRANSCODE_SUCCEED", TRANSCODE_SUCCEED);
            map.put("TRANSCODE_FAILED", TRANSCODE_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TranscodeStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TranscodeStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TranscodeStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TranscodeStatusEnum(value);
            }
            return result;
        }

        public static TranscodeStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TranscodeStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TranscodeStatusEnum) {
                return this.value.equals(((TranscodeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transcode_status")
    
    private TranscodeStatusEnum transcodeStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_info")
    
    private BaseInfo baseInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transcode_info")
    
    private TranscodeInfo transcodeInfo;

    public ShowTakeOverAssetDetailsResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒资ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public ShowTakeOverAssetDetailsResponse withAssetStatus(AssetStatusEnum assetStatus) {
        this.assetStatus = assetStatus;
        return this;
    }

    


    /**
     * 媒资状态。 - \"CREATING\"：上传中 - \"FAILED\"：上传失败 - \"CREATED\"：上传成功 - \"PUBLISHED\"：已发布 - \"DELETED\"：已删除
     * @return assetStatus
     */
    public AssetStatusEnum getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(AssetStatusEnum assetStatus) {
        this.assetStatus = assetStatus;
    }

    

    public ShowTakeOverAssetDetailsResponse withTranscodeStatus(TranscodeStatusEnum transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
        return this;
    }

    


    /**
     * 转码状态 - \"UN_TRANSCODE\"：未转码 - \"WAITING_TRANSCODE\"：等待转码，排队中 - \"TRANSCODING\"：转码中 - \"TRANSCODE_SUCCEED\"：转码成功 - \"TRANSCODE_FAILED\"：转码失败
     * @return transcodeStatus
     */
    public TranscodeStatusEnum getTranscodeStatus() {
        return transcodeStatus;
    }

    public void setTranscodeStatus(TranscodeStatusEnum transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
    }

    

    public ShowTakeOverAssetDetailsResponse withBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ShowTakeOverAssetDetailsResponse withBaseInfo(Consumer<BaseInfo> baseInfoSetter) {
        if(this.baseInfo == null ){
            this.baseInfo = new BaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }
        
        return this;
    }


    /**
     * Get baseInfo
     * @return baseInfo
     */
    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    

    public ShowTakeOverAssetDetailsResponse withTranscodeInfo(TranscodeInfo transcodeInfo) {
        this.transcodeInfo = transcodeInfo;
        return this;
    }

    public ShowTakeOverAssetDetailsResponse withTranscodeInfo(Consumer<TranscodeInfo> transcodeInfoSetter) {
        if(this.transcodeInfo == null ){
            this.transcodeInfo = new TranscodeInfo();
            transcodeInfoSetter.accept(this.transcodeInfo);
        }
        
        return this;
    }


    /**
     * Get transcodeInfo
     * @return transcodeInfo
     */
    public TranscodeInfo getTranscodeInfo() {
        return transcodeInfo;
    }

    public void setTranscodeInfo(TranscodeInfo transcodeInfo) {
        this.transcodeInfo = transcodeInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTakeOverAssetDetailsResponse showTakeOverAssetDetailsResponse = (ShowTakeOverAssetDetailsResponse) o;
        return Objects.equals(this.assetId, showTakeOverAssetDetailsResponse.assetId) &&
            Objects.equals(this.assetStatus, showTakeOverAssetDetailsResponse.assetStatus) &&
            Objects.equals(this.transcodeStatus, showTakeOverAssetDetailsResponse.transcodeStatus) &&
            Objects.equals(this.baseInfo, showTakeOverAssetDetailsResponse.baseInfo) &&
            Objects.equals(this.transcodeInfo, showTakeOverAssetDetailsResponse.transcodeInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetStatus, transcodeStatus, baseInfo, transcodeInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTakeOverAssetDetailsResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetStatus: ").append(toIndentedString(assetStatus)).append("\n");
        sb.append("    transcodeStatus: ").append(toIndentedString(transcodeStatus)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    transcodeInfo: ").append(toIndentedString(transcodeInfo)).append("\n");
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

