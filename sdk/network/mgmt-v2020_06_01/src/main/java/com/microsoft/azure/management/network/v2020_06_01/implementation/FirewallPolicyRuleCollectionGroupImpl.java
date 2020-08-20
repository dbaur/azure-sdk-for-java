/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.management.network.v2020_06_01.FirewallPolicyRuleCollectionGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.FirewallPolicyRuleCollection;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;

class FirewallPolicyRuleCollectionGroupImpl extends CreatableUpdatableImpl<FirewallPolicyRuleCollectionGroup, FirewallPolicyRuleCollectionGroupInner, FirewallPolicyRuleCollectionGroupImpl> implements FirewallPolicyRuleCollectionGroup, FirewallPolicyRuleCollectionGroup.Definition, FirewallPolicyRuleCollectionGroup.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String firewallPolicyName;
    private String ruleCollectionGroupName;

    FirewallPolicyRuleCollectionGroupImpl(String name, NetworkManager manager) {
        super(name, new FirewallPolicyRuleCollectionGroupInner());
        this.manager = manager;
        // Set resource name
        this.ruleCollectionGroupName = name;
        //
    }

    FirewallPolicyRuleCollectionGroupImpl(FirewallPolicyRuleCollectionGroupInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.ruleCollectionGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.firewallPolicyName = IdParsingUtils.getValueFromIdByName(inner.id(), "firewallPolicies");
        this.ruleCollectionGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "ruleCollectionGroups");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<FirewallPolicyRuleCollectionGroup> createResourceAsync() {
        FirewallPolicyRuleCollectionGroupsInner client = this.manager().inner().firewallPolicyRuleCollectionGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.firewallPolicyName, this.ruleCollectionGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FirewallPolicyRuleCollectionGroup> updateResourceAsync() {
        FirewallPolicyRuleCollectionGroupsInner client = this.manager().inner().firewallPolicyRuleCollectionGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.firewallPolicyName, this.ruleCollectionGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FirewallPolicyRuleCollectionGroupInner> getInnerAsync() {
        FirewallPolicyRuleCollectionGroupsInner client = this.manager().inner().firewallPolicyRuleCollectionGroups();
        return client.getAsync(this.resourceGroupName, this.firewallPolicyName, this.ruleCollectionGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer priority() {
        return this.inner().priority();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<FirewallPolicyRuleCollection> ruleCollections() {
        return this.inner().ruleCollections();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FirewallPolicyRuleCollectionGroupImpl withExistingFirewallPolicy(String resourceGroupName, String firewallPolicyName) {
        this.resourceGroupName = resourceGroupName;
        this.firewallPolicyName = firewallPolicyName;
        return this;
    }

    @Override
    public FirewallPolicyRuleCollectionGroupImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public FirewallPolicyRuleCollectionGroupImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public FirewallPolicyRuleCollectionGroupImpl withPriority(Integer priority) {
        this.inner().withPriority(priority);
        return this;
    }

    @Override
    public FirewallPolicyRuleCollectionGroupImpl withRuleCollections(List<FirewallPolicyRuleCollection> ruleCollections) {
        this.inner().withRuleCollections(ruleCollections);
        return this;
    }

}
