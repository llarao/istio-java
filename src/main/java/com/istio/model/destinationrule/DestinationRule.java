package com.istio.model.destinationrule;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Generated;

/**
 * @Classname VirtualService
 * @Description TODO
 * @Date 2020/10/17 0017 10:14
 * @Create by llarao
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apiVersion",
        "kind",
        "metadata",
        "spec",
        "status"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DestinationRule implements HasMetadata {
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("apiVersion")
    private String apiVersion = "networking.istio.io/v1alpha3";
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("kind")
    private String kind = "DestinationRule";
    /**
     *
     *
     */
    @JsonProperty("metadata")
    private ObjectMeta metadata;
    /**
     *
     *
     */
    @JsonProperty("spec")
    private DestinationRuleSpec spec;



}
