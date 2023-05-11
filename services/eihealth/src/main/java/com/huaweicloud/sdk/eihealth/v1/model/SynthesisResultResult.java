package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合成路径规划结果字典
 */
public class SynthesisResultResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "molecules")

    private List<SynthesisResultResultMolecules> molecules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reactions")

    private List<SynthesisResultResultReactions> reactions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synthesis_routes")

    private List<SynthesisResultItem> synthesisRoutes = null;

    public SynthesisResultResult withMolecules(List<SynthesisResultResultMolecules> molecules) {
        this.molecules = molecules;
        return this;
    }

    public SynthesisResultResult addMoleculesItem(SynthesisResultResultMolecules moleculesItem) {
        if (this.molecules == null) {
            this.molecules = new ArrayList<>();
        }
        this.molecules.add(moleculesItem);
        return this;
    }

    public SynthesisResultResult withMolecules(Consumer<List<SynthesisResultResultMolecules>> moleculesSetter) {
        if (this.molecules == null) {
            this.molecules = new ArrayList<>();
        }
        moleculesSetter.accept(this.molecules);
        return this;
    }

    /**
     * 分子合成规划中的分子
     * @return molecules
     */
    public List<SynthesisResultResultMolecules> getMolecules() {
        return molecules;
    }

    public void setMolecules(List<SynthesisResultResultMolecules> molecules) {
        this.molecules = molecules;
    }

    public SynthesisResultResult withReactions(List<SynthesisResultResultReactions> reactions) {
        this.reactions = reactions;
        return this;
    }

    public SynthesisResultResult addReactionsItem(SynthesisResultResultReactions reactionsItem) {
        if (this.reactions == null) {
            this.reactions = new ArrayList<>();
        }
        this.reactions.add(reactionsItem);
        return this;
    }

    public SynthesisResultResult withReactions(Consumer<List<SynthesisResultResultReactions>> reactionsSetter) {
        if (this.reactions == null) {
            this.reactions = new ArrayList<>();
        }
        reactionsSetter.accept(this.reactions);
        return this;
    }

    /**
     * 分子合成规划中的反应列表
     * @return reactions
     */
    public List<SynthesisResultResultReactions> getReactions() {
        return reactions;
    }

    public void setReactions(List<SynthesisResultResultReactions> reactions) {
        this.reactions = reactions;
    }

    public SynthesisResultResult withSynthesisRoutes(List<SynthesisResultItem> synthesisRoutes) {
        this.synthesisRoutes = synthesisRoutes;
        return this;
    }

    public SynthesisResultResult addSynthesisRoutesItem(SynthesisResultItem synthesisRoutesItem) {
        if (this.synthesisRoutes == null) {
            this.synthesisRoutes = new ArrayList<>();
        }
        this.synthesisRoutes.add(synthesisRoutesItem);
        return this;
    }

    public SynthesisResultResult withSynthesisRoutes(Consumer<List<SynthesisResultItem>> synthesisRoutesSetter) {
        if (this.synthesisRoutes == null) {
            this.synthesisRoutes = new ArrayList<>();
        }
        synthesisRoutesSetter.accept(this.synthesisRoutes);
        return this;
    }

    /**
     * 分子合成规划的具体信息
     * @return synthesisRoutes
     */
    public List<SynthesisResultItem> getSynthesisRoutes() {
        return synthesisRoutes;
    }

    public void setSynthesisRoutes(List<SynthesisResultItem> synthesisRoutes) {
        this.synthesisRoutes = synthesisRoutes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SynthesisResultResult synthesisResultResult = (SynthesisResultResult) o;
        return Objects.equals(this.molecules, synthesisResultResult.molecules)
            && Objects.equals(this.reactions, synthesisResultResult.reactions)
            && Objects.equals(this.synthesisRoutes, synthesisResultResult.synthesisRoutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(molecules, reactions, synthesisRoutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisResultResult {\n");
        sb.append("    molecules: ").append(toIndentedString(molecules)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    synthesisRoutes: ").append(toIndentedString(synthesisRoutes)).append("\n");
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
