/*
 * Copyright 2022 The Quilt Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.quilted_fabric_api.fabric.resource.loader.v0.impl;

import net.minecraft.resource.ResourcePackSource;

import net.fabricmc.fabric.impl.resource.loader.FabricResource;

/**
 * Holds an individual source setter in order to properly support group resource packs.
 */
public interface QuiltedFabricResource extends FabricResource {
	void setFabricIndividualSource(ResourcePackSource source);
}