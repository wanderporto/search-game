import { Platform } from "../Records/types";

export type Game = {
    id: string;
    title: string;
    platform: Platform;
}

export type ChartItem = {
    x: string;
    y: number;
}