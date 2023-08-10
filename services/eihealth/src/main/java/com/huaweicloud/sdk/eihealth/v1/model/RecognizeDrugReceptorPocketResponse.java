package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RecognizeDrugReceptorPocketResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private RecognizeReceptorPocketMode mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pockets")

    private List<BoundingBoxDto> pockets = null;

    public RecognizeDrugReceptorPocketResponse withMode(RecognizeReceptorPocketMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     * @return mode
     */
    public RecognizeReceptorPocketMode getMode() {
        return mode;
    }

    public void setMode(RecognizeReceptorPocketMode mode) {
        this.mode = mode;
    }

    public RecognizeDrugReceptorPocketResponse withPockets(List<BoundingBoxDto> pockets) {
        this.pockets = pockets;
        return this;
    }

    public RecognizeDrugReceptorPocketResponse addPocketsItem(BoundingBoxDto pocketsItem) {
        if (this.pockets == null) {
            this.pockets = new ArrayList<>();
        }
        this.pockets.add(pocketsItem);
        return this;
    }

    public RecognizeDrugReceptorPocketResponse withPockets(Consumer<List<BoundingBoxDto>> pocketsSetter) {
        if (this.pockets == null) {
            this.pockets = new ArrayList<>();
        }
        pocketsSetter.accept(this.pockets);
        return this;
    }

    /**
     * 口袋列表
     * @return pockets
     */
    public List<BoundingBoxDto> getPockets() {
        return pockets;
    }

    public void setPockets(List<BoundingBoxDto> pockets) {
        this.pockets = pockets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecognizeDrugReceptorPocketResponse that = (RecognizeDrugReceptorPocketResponse) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.pockets, that.pockets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, pockets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeDrugReceptorPocketResponse {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    pockets: ").append(toIndentedString(pockets)).append("\n");
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
