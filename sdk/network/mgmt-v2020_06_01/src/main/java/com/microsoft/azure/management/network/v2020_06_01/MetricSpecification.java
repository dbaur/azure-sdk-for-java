/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of metrics specification.
 */
public class MetricSpecification {
    /**
     * The name of the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display name of the metric.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The description of the metric.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /**
     * Units the metric to be displayed in.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * The aggregation type.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /**
     * List of availability.
     */
    @JsonProperty(value = "availabilities")
    private List<Availability> availabilities;

    /**
     * Whether regional MDM account enabled.
     */
    @JsonProperty(value = "enableRegionalMdmAccount")
    private Boolean enableRegionalMdmAccount;

    /**
     * Whether gaps would be filled with zeros.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /**
     * Pattern for the filter of the metric.
     */
    @JsonProperty(value = "metricFilterPattern")
    private String metricFilterPattern;

    /**
     * List of dimensions.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /**
     * Whether the metric is internal.
     */
    @JsonProperty(value = "isInternal")
    private Boolean isInternal;

    /**
     * The source MDM account.
     */
    @JsonProperty(value = "sourceMdmAccount")
    private String sourceMdmAccount;

    /**
     * The source MDM namespace.
     */
    @JsonProperty(value = "sourceMdmNamespace")
    private String sourceMdmNamespace;

    /**
     * The resource Id dimension name override.
     */
    @JsonProperty(value = "resourceIdDimensionNameOverride")
    private String resourceIdDimensionNameOverride;

    /**
     * Get the name of the metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the metric.
     *
     * @param name the name value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display name of the metric.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the metric.
     *
     * @param displayName the displayName value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description of the metric.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the description of the metric.
     *
     * @param displayDescription the displayDescription value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get units the metric to be displayed in.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set units the metric to be displayed in.
     *
     * @param unit the unit value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregation type.
     *
     * @return the aggregationType value
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregation type.
     *
     * @param aggregationType the aggregationType value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get list of availability.
     *
     * @return the availabilities value
     */
    public List<Availability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set list of availability.
     *
     * @param availabilities the availabilities value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAvailabilities(List<Availability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Get whether regional MDM account enabled.
     *
     * @return the enableRegionalMdmAccount value
     */
    public Boolean enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set whether regional MDM account enabled.
     *
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withEnableRegionalMdmAccount(Boolean enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get whether gaps would be filled with zeros.
     *
     * @return the fillGapWithZero value
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set whether gaps would be filled with zeros.
     *
     * @param fillGapWithZero the fillGapWithZero value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get pattern for the filter of the metric.
     *
     * @return the metricFilterPattern value
     */
    public String metricFilterPattern() {
        return this.metricFilterPattern;
    }

    /**
     * Set pattern for the filter of the metric.
     *
     * @param metricFilterPattern the metricFilterPattern value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withMetricFilterPattern(String metricFilterPattern) {
        this.metricFilterPattern = metricFilterPattern;
        return this;
    }

    /**
     * Get list of dimensions.
     *
     * @return the dimensions value
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set list of dimensions.
     *
     * @param dimensions the dimensions value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get whether the metric is internal.
     *
     * @return the isInternal value
     */
    public Boolean isInternal() {
        return this.isInternal;
    }

    /**
     * Set whether the metric is internal.
     *
     * @param isInternal the isInternal value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    /**
     * Get the source MDM account.
     *
     * @return the sourceMdmAccount value
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the source MDM account.
     *
     * @param sourceMdmAccount the sourceMdmAccount value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the source MDM namespace.
     *
     * @return the sourceMdmNamespace value
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the source MDM namespace.
     *
     * @param sourceMdmNamespace the sourceMdmNamespace value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get the resource Id dimension name override.
     *
     * @return the resourceIdDimensionNameOverride value
     */
    public String resourceIdDimensionNameOverride() {
        return this.resourceIdDimensionNameOverride;
    }

    /**
     * Set the resource Id dimension name override.
     *
     * @param resourceIdDimensionNameOverride the resourceIdDimensionNameOverride value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withResourceIdDimensionNameOverride(String resourceIdDimensionNameOverride) {
        this.resourceIdDimensionNameOverride = resourceIdDimensionNameOverride;
        return this;
    }

}
