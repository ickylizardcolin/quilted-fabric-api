/*
 * Copyright 2016, 2017, 2018, 2019 FabricMC
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

package net.fabricmc.fabric.api.object.builder.v1.trade;

import java.util.List;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

/**
 * Utilities to help with registration of trade offers.
 *
 * @deprecated Use Quilt Villager API's {@link org.quiltmc.qsl.villager.api.TradeOfferHelper} instead.
 */
@Deprecated
public final class TradeOfferHelper {
	private static final Logger LOGGER = LoggerFactory.getLogger("fabric-object-builder-api-v1");

	/**
	 * Registers trade offer factories for use by villagers.
	 *
	 * <p>Below is an example, of registering a trade offer factory to be added a blacksmith with a profession level of 3:
	 * <blockquote><pre>
	 * TradeOfferHelper.registerVillagerOffers(VillagerProfession.BLACKSMITH, 3, factories -> {
	 * 	factories.add(new CustomTradeFactory(...);
	 * });
	 * </pre></blockquote>
	 *
	 * @param profession the villager profession to assign the trades to
	 * @param level the profession level the villager must be to offer the trades
	 * @param factories a consumer to provide the factories
	 */
	public static void registerVillagerOffers(VillagerProfession profession, int level, Consumer<List<TradeOffers.Factory>> factories) {
		org.quiltmc.qsl.villager.api.TradeOfferHelper.registerVillagerOffers(profession, level, factories);
	}

	/**
	 * Registers trade offer factories for use by wandering trades.
	 *
	 * @param level the level the trades
	 * @param factory a consumer to provide the factories
	 */
	public static void registerWanderingTraderOffers(int level, Consumer<List<TradeOffers.Factory>> factory) {
		org.quiltmc.qsl.villager.api.TradeOfferHelper.registerWanderingTraderOffers(level, factory);
	}

	/**
	 * @deprecated This never did anything useful.
	 */
	@Deprecated(forRemoval = true)
	public static void refreshOffers() {
		// TradeOfferInternals.printRefreshOffersWarning();
		Throwable loggingThrowable = new Throwable();
		LOGGER.warn("TradeOfferHelper#refreshOffers does not do anything, yet it was called! Stack trace:", loggingThrowable);
	}
}
