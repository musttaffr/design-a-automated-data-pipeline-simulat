Kotlin
data class DataPoint(val timestamp: Long, val value: Double)

enum class DataSourceType { CSV, DATABASE, API }

data class DataSource(val id: Int, val type: DataSourceType, val location: String)

data class Pipeline(val id: Int, val dataSource: DataSource, val transformations: List<Transformation>)

sealed class Transformation {
    data class Filter(val predicate: (DataPoint) -> Boolean) : Transformation()
    data class Mapper(val mapping: (DataPoint) -> DataPoint) : Transformation()
    data class Aggregator(val aggregation: (List<DataPoint>) -> DataPoint) : Transformation()
}

data class SimulatorConfig(val pipeline: Pipeline, val simulationTime: Long, val interval: Long)

class AutomatedDataPipelineSimulator(val config: SimulatorConfig) {
    fun simulate(): List<DataPoint> {
        // TO DO: implement simulation logic
        return emptyList()
    }
}