package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RoundDeployVo
 */
public class RoundDeployVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploys")

    private List<DeployVo> deploys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "round_id")

    private Integer roundId;

    public RoundDeployVo withDeploys(List<DeployVo> deploys) {
        this.deploys = deploys;
        return this;
    }

    public RoundDeployVo addDeploysItem(DeployVo deploysItem) {
        if (this.deploys == null) {
            this.deploys = new ArrayList<>();
        }
        this.deploys.add(deploysItem);
        return this;
    }

    public RoundDeployVo withDeploys(Consumer<List<DeployVo>> deploysSetter) {
        if (this.deploys == null) {
            this.deploys = new ArrayList<>();
        }
        deploysSetter.accept(this.deploys);
        return this;
    }

    /**
     * deploy
     * @return deploys
     */
    public List<DeployVo> getDeploys() {
        return deploys;
    }

    public void setDeploys(List<DeployVo> deploys) {
        this.deploys = deploys;
    }

    public RoundDeployVo withRoundId(Integer roundId) {
        this.roundId = roundId;
        return this;
    }

    /**
     * 轮数
     * @return roundId
     */
    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundDeployVo that = (RoundDeployVo) obj;
        return Objects.equals(this.deploys, that.deploys) && Objects.equals(this.roundId, that.roundId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deploys, roundId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoundDeployVo {\n");
        sb.append("    deploys: ").append(toIndentedString(deploys)).append("\n");
        sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
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
