package com.microsoft.azure.management.costmanagement.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastDefinition {

    /**
     * Has definition for data in this forecast.
     */
    @JsonProperty(value = "dataset")
    private QueryDataset dataset;

    /**
     * a boolean determining if actualCost will be included
     */
    @JsonProperty(value = "includeActualCost")
    private boolean includeActualCost;

    /**
     * a boolean determining if FreshPartialCost will be included
     */
    @JsonProperty(value = "includeFreshPartialCost")
    private boolean includeFreshPartialCost;

    /**
     * Has time period for pulling data for the forecast.
     */
    @JsonProperty(value = "queryTimePeriod")
    private QueryTimePeriod queryTimePeriod;

    /**
     * The time frame for pulling data for the forecast. If custom, then a specific time period must be provided.
     */
    @JsonProperty(value = "timeframe")
    private ForecastTimeframeType timeframe;

    /**
     * The type of the forecast.
     */
    @JsonProperty(value = "type")
    private ForecastType type;

    public QueryDataset getDataset() {
        return dataset;
    }

    public ForecastDefinition withDataset(QueryDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    public boolean isIncludeActualCost() {
        return includeActualCost;
    }

    public ForecastDefinition withIncludeActualCost(boolean includeActualCost) {
        this.includeActualCost = includeActualCost;
        return this;
    }

    public boolean isIncludeFreshPartialCost() {
        return includeFreshPartialCost;
    }

    public ForecastDefinition withIncludeFreshPartialCost(boolean includeFreshPartialCost) {
        this.includeFreshPartialCost = includeFreshPartialCost;
        return this;
    }

    public QueryTimePeriod getQueryTimePeriod() {
        return queryTimePeriod;
    }

    public ForecastDefinition withQueryTimePeriod(
        QueryTimePeriod queryTimePeriod) {
        this.queryTimePeriod = queryTimePeriod;
        return this;
    }

    public ForecastTimeframeType getTimeframe() {
        return timeframe;
    }

    public ForecastDefinition withTimeframe(
        ForecastTimeframeType timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    public ForecastType getType() {
        return type;
    }

    public ForecastDefinition withType(ForecastType type) {
        this.type = type;
        return this;
    }
}
