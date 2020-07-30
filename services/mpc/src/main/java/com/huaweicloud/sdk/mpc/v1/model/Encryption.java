package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.HlsEncrypt;
import com.huaweicloud.sdk.mpc.v1.model.Multidrm;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Encryption
 */
public class Encryption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hls_encrypt")
    
    private HlsEncrypt hlsEncrypt = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multidrm")
    
    private Multidrm multidrm = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preview_duration")
    
    private Integer previewDuration = 0;

    public Encryption withHlsEncrypt(HlsEncrypt hlsEncrypt) {
        this.hlsEncrypt = hlsEncrypt;
        return this;
    }

    public Encryption withHlsEncrypt(Consumer<HlsEncrypt> hlsEncryptSetter) {
        if(this.hlsEncrypt == null ){
            this.hlsEncrypt = new HlsEncrypt();
            hlsEncryptSetter.accept(this.hlsEncrypt);
        }
        
        return this;
    }


    /**
     * Get hlsEncrypt
     * @return hlsEncrypt
     */
    public HlsEncrypt getHlsEncrypt() {
        return hlsEncrypt;
    }

    public void setHlsEncrypt(HlsEncrypt hlsEncrypt) {
        this.hlsEncrypt = hlsEncrypt;
    }

    public Encryption withMultidrm(Multidrm multidrm) {
        this.multidrm = multidrm;
        return this;
    }

    public Encryption withMultidrm(Consumer<Multidrm> multidrmSetter) {
        if(this.multidrm == null ){
            this.multidrm = new Multidrm();
            multidrmSetter.accept(this.multidrm);
        }
        
        return this;
    }


    /**
     * Get multidrm
     * @return multidrm
     */
    public Multidrm getMultidrm() {
        return multidrm;
    }

    public void setMultidrm(Multidrm multidrm) {
        this.multidrm = multidrm;
    }

    public Encryption withPreviewDuration(Integer previewDuration) {
        this.previewDuration = previewDuration;
        return this;
    }

    


    /**
     * 加密预览时长, 单位秒(S), 0 - preview_duration之间的内容不加密
     * minimum: 0
     * maximum: 2147483647
     * @return previewDuration
     */
    public Integer getPreviewDuration() {
        return previewDuration;
    }

    public void setPreviewDuration(Integer previewDuration) {
        this.previewDuration = previewDuration;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Encryption encryption = (Encryption) o;
        return Objects.equals(this.hlsEncrypt, encryption.hlsEncrypt) &&
            Objects.equals(this.multidrm, encryption.multidrm) &&
            Objects.equals(this.previewDuration, encryption.previewDuration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hlsEncrypt, multidrm, previewDuration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Encryption {\n");
        sb.append("    hlsEncrypt: ").append(toIndentedString(hlsEncrypt)).append("\n");
        sb.append("    multidrm: ").append(toIndentedString(multidrm)).append("\n");
        sb.append("    previewDuration: ").append(toIndentedString(previewDuration)).append("\n");
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

