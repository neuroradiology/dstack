package ai.dstack.server.services

import ai.dstack.server.model.Card

interface CardService {
    fun create(card: Card)
    fun getByDashboardPath(dashboardPath: String): List<Card>
    fun get(dashboardPath : String, stackPath: String): Card?
    fun update(cards: List<Card>)
    fun delete(card: Card)
    fun deleteByDashboardPath(dashboardPath: String)
    fun deleteByStackPath(stackPath: String)
}