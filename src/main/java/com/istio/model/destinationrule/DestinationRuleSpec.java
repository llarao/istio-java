package com.istio.model.destinationrule;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

/**
 * @Classname VirtualServiceSpec
 * @Description TODO
 * @Date 2020/10/17 0017 15:57
 * @Create by llarao
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apiVersion",
        "kind",
        "metadata",
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinationRuleSpec implements KubernetesResource {
    /**
     * DR规则对应的service
     */
    private String host;

    /**
     * 流量规则
     */
    private TrafficPolicy trafficPolicy;

    /**
     * 版本子集
     */
    private List<Subset> subsets;

}
