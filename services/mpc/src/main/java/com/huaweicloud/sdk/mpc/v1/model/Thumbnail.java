package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import com.huaweicloud.sdk.mpc.v1.model.ThumbnailPara;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Thumbnail
 */
public class Thumbnail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tar")
    
    private Integer tar = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="out")
    
    private ObsObjInfo out = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    private ThumbnailPara params = null;

    public Thumbnail withTar(Integer tar) {
        this.tar = tar;
        return this;
    }

    


    /**
     * 是否压缩抽帧图片生成tar包 - 0：表示压缩 - 1：表示不压缩 
     * minimum: 0
     * maximum: 1
     * @return tar
     */
    public Integer getTar() {
        return tar;
    }

    public void setTar(Integer tar) {
        this.tar = tar;
    }

    public Thumbnail withOut(ObsObjInfo out) {
        this.out = out;
        return this;
    }

    public Thumbnail withOut(Consumer<ObsObjInfo> outSetter) {
        if(this.out == null ){
            this.out = new ObsObjInfo();
            outSetter.accept(this.out);
        }
        
        return this;
    }


    /**
     * Get out
     * @return out
     */
    public ObsObjInfo getOut() {
        return out;
    }

    public void setOut(ObsObjInfo out) {
        this.out = out;
    }

    public Thumbnail withParams(ThumbnailPara params) {
        this.params = params;
        return this;
    }

    public Thumbnail withParams(Consumer<ThumbnailPara> paramsSetter) {
        if(this.params == null ){
            this.params = new ThumbnailPara();
            paramsSetter.accept(this.params);
        }
        
        return this;
    }


    /**
     * Get params
     * @return params
     */
    public ThumbnailPara getParams() {
        return params;
    }

    public void setParams(ThumbnailPara params) {
        this.params = params;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Thumbnail thumbnail = (Thumbnail) o;
        return Objects.equals(this.tar, thumbnail.tar) &&
            Objects.equals(this.out, thumbnail.out) &&
            Objects.equals(this.params, thumbnail.params);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tar, out, params);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Thumbnail {\n");
        sb.append("    tar: ").append(toIndentedString(tar)).append("\n");
        sb.append("    out: ").append(toIndentedString(out)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

