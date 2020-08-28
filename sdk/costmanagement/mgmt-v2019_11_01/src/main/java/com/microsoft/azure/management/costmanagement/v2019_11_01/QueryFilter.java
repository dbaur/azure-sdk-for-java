/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The filter expression to be used in the export.
 */
public class QueryFilter {
    /**
     * The logical "AND" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "and")
    private List<QueryFilter> and;

    /**
     * The logical "OR" expression. Must have at least 2 items.
     */
    @JsonProperty(value = "or")
    private List<QueryFilter> or;

    /**
     * The logical "NOT" expression.
     */
    @JsonProperty(value = "not")
    private QueryFilter not;

    /**
     * Has comparison expression for a dimension.
     */
    @JsonProperty(value = "dimensions")
    private QueryComparisonExpression dimension;

    /**
     * Has comparison expression for a tag.
     */
    @JsonProperty(value = "tag")
    private QueryComparisonExpression tag;

    /**
     * Get the logical "AND" expression. Must have at least 2 items.
     *
     * @return the and value
     */
    public List<QueryFilter> and() {
        return this.and;
    }

    /**
     * Set the logical "AND" expression. Must have at least 2 items.
     *
     * @param and the and value to set
     * @return the QueryFilter object itself.
     */
    public QueryFilter withAnd(List<QueryFilter> and) {
        this.and = and;
        return this;
    }

    /**
     * Get the logical "OR" expression. Must have at least 2 items.
     *
     * @return the or value
     */
    public List<QueryFilter> or() {
        return this.or;
    }

    /**
     * Set the logical "OR" expression. Must have at least 2 items.
     *
     * @param or the or value to set
     * @return the QueryFilter object itself.
     */
    public QueryFilter withOr(List<QueryFilter> or) {
        this.or = or;
        return this;
    }

    /**
     * Get the logical "NOT" expression.
     *
     * @return the not value
     */
    public QueryFilter not() {
        return this.not;
    }

    /**
     * Set the logical "NOT" expression.
     *
     * @param not the not value to set
     * @return the QueryFilter object itself.
     */
    public QueryFilter withNot(QueryFilter not) {
        this.not = not;
        return this;
    }

    /**
     * Get has comparison expression for a dimension.
     *
     * @return the dimension value
     */
    public QueryComparisonExpression dimension() {
        return this.dimension;
    }

    /**
     * Set has comparison expression for a dimension.
     *
     * @param dimension the dimension value to set
     * @return the QueryFilter object itself.
     */
    public QueryFilter withDimension(QueryComparisonExpression dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get has comparison expression for a tag.
     *
     * @return the tag value
     */
    public QueryComparisonExpression tag() {
        return this.tag;
    }

    /**
     * Set has comparison expression for a tag.
     *
     * @param tag the tag value to set
     * @return the QueryFilter object itself.
     */
    public QueryFilter withTag(QueryComparisonExpression tag) {
        this.tag = tag;
        return this;
    }

}
